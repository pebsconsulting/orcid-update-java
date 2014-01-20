package uk.bl.odin.orcid.domain;

/**
 * Models the OAuth token response from ORCID. example:
 * {"access_token":"4511576a-eaa1-48a4-b282-4fab5f889f87",
 * "token_type":"bearer", "refresh_token":"77256874-2036-41c9-9800-fe56b5e9a2a4"
 * , "expires_in":3599, "scope":"/orcid-works/update",
 * "orcid":"0000-0003-1495-7122"}
 * 
 * @author tom
 * 
 */
public class OrcidAccessTokenResponse {

	private String access_token;
	private String token_type;
	private String refresh_token;
	private int expires_in;
	private String scope;
	private String orcid;

	// keeps track of doc requested by user. optional.
	private String state;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getOrcid() {
		return orcid;
	}

	public void setOrcid(String orcid) {
		this.orcid = orcid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}