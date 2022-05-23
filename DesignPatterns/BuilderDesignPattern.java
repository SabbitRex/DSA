class UserContext {
	
	private int userId;
	private String userName;
	private String userIdpHost;
	private String userLocale;
	
	
	private UserContext(UserContextBuilder builder) {
		
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.userIdpHost = builder.userIdpHost;
		this.userLocale = builder.userLocale;
	}
	
	public int getUserId() {
		
		return this.userId;
	}
	
	public String getUserName() {
		
		return this.userName;
	}
	
	public String getuserIdpHost() {
		
		return this.userIdpHost;
	}
	
	public String getuserLocale() {
		
		return this.userLocale;
	}
	
	public static class UserContextBuilder {
		
		private int userId;
		private String userName;
		private String userIdpHost;
		private String userLocale;
		
		public UserContextBuilder() {}
		
		public UserContextBuilder setUserId(int userId) {
			
			this.userId = userId;
			return this;
		}
		
		public UserContextBuilder setUserName(String userName) {
			
			this.userName = userName;
			return this;
		}
		
		public UserContextBuilder setUserIdpHost(String userIdpHost) {
			
			this.userIdpHost = userIdpHost;
			return this;
		}
		
		public UserContextBuilder setUserLocale(String userLocale) {
			
			this.userLocale = userLocale;
			return this;
		}
		
		public UserContext build() {
			
			return new UserContext(this);
		}
	}
}

public class BuilderDesignPattern {

	public static void main(String[] args) {
		
		UserContext context = new UserContext.UserContextBuilder()
				.setUserId(120045)
				.setUserName("John Doe")
				.setUserIdpHost("Azure")
				.setUserLocale("EN-US")
				.build();
		
		System.out.println(context.getUserId());
		System.out.println(context.getUserName());
		System.out.println(context.getuserIdpHost());
		System.out.println(context.getuserLocale());
	}
}
