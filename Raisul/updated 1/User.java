class User{
		private String firstName;
		private String lastName;
		private String userName;
		private String password;
		private String email;
		private String contactNo;
		
		
		public User(){
			
		}
		public User(String f,String l,String u,String p,String e,String c){
			this.firstName=f;
			this.lastName=l;
			this.userName=u;
			this.password=p;
			this.email=e;
			this.contactNo=c;

		}
		
		public void setF(String f){
			this.firstName=f;
		}
		public void setL(String l){
			this.lastName=l;
		}
		public void setU(String u){
			this.userName=u;
		}
		public void setP(String p){
			this.password=p;
		}
		public void setE(String e){
			this.email=e;
		}
		public void setC(String c){
			this.contactNo=c;
		}
		
		public String getF(){
			return this.firstName;
		}
		public String getL(){
			return this.lastName;
		}
		public String getU(){
			return this.userName;
		}
		public String getP(){
			return this.password;
		}
		public String getE(){
			return this.email;
		}
		public String getC(){
			return this.contactNo;
		}
	}
