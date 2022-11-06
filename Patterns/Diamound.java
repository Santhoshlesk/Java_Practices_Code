class diamound{
	public static void main(String []args){
		int i,j,n=7,z,x; 
		for(i=0;i<=n;i++){
			for(z=i;z<=n;z++){
				System.out.print(" ");
			}
			for(j=0;j<i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n-1;i>0;i--){
			for(z=i;z<=n;z++){
				System.out.print(" ");
			}
			for(j=0;j<i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}