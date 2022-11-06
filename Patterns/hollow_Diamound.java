import java.util.*;
class hollow_Diamound{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Size:");
		int n=in.nextInt();
		int i,j,z,k=2;
		//top hollow pattern.
		for(i=1;i<=n;i++){
			for(z=i;z<=n;z++){
				System.out.print(" ");
			}
			
			for(j=1;j<=i*2-1;j++){
				if(j>=2 && j<=k ){
					System.out.print(" ");
				}
				else{System.out.print("*");}
			}
			if(i>=2 ){k+=2;}
			System.out.println();
		}
		k-=2;
		k-=2;
		//bottom hollow pattern.
		for(i=n-1;i>=1;i--){
			for(z=i;z<=n;z++){
				System.out.print(" ");
			}
			
			for(j=1;j<=i*2-1;j++){
				if(j>=2 && j<=k ){
					System.out.print(" ");
				}
				else{System.out.print("*");}
			}
			if(i>=2){k-=2;}
			System.out.println();
		}
	}
}