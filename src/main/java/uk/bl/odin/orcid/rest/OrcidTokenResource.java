package uk.bl.odin.orcid.rest;

import java.io.IOException;

import javax.inject.Inject;

import org.restlet.data.Status;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;

import uk.bl.odin.orcid.client.OrcidAccessToken;
import uk.bl.odin.orcid.client.OrcidOAuthClient;
import uk.bl.odin.orcid.guice.SelfInjectingServerResource;

public class OrcidTokenResource extends SelfInjectingServerResource {

	@Inject
	OrcidOAuthClient orcidOAuthClient;

	/**
	 * This resource is hit by the return from a ORCID OAuth. returns Access
	 * token to client along with state param.
	 */
	@Get
	public OrcidAccessToken getTokenResponse() {
		String code = this.getQueryValue("code");
		try {
			OrcidAccessToken token = orcidOAuthClient.getAccessToken(code);
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
