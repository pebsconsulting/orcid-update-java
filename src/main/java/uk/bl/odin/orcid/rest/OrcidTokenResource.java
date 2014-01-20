package uk.bl.odin.orcid.rest;

import java.io.IOException;

import org.restlet.data.Status;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import uk.bl.odin.orcid.domain.OrcidAccessTokenResponse;
import uk.bl.odin.orcid.domain.OrcidOAuthClient;

public class OrcidTokenResource extends ServerResource {

	/**
	 * This resource is hit by the return from a ORCID OAuth. returns Access
	 * token to client along with state param.
	 */
	@Get
	public OrcidAccessTokenResponse getTokenResponse() {
		String code = this.getQueryValue("code");
		try {
			OrcidAccessTokenResponse token = ((OrcidOAuthClient) getContext().getAttributes().get("OrcidOAuthClient"))
					.getAccessToken(code);
			String ref = this.getQueryValue("state");
			token.setState(ref);
			return token;
		} catch (ResourceException e) {
			setStatus(Status.CLIENT_ERROR_BAD_REQUEST, "token invalid, cannot resolve token");
		} catch (IOException e) {
			setStatus(Status.SERVER_ERROR_INTERNAL, "problem resolving token " + e.getMessage());
		}
		return null;
	}
}
