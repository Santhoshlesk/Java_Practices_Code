import java.util.*;
class Triangle_Star_pattern{
	public static void main(String []args){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Size:");
		int n=in.nextInt();
		int i,j,z,k=2;
		for(i=1;i<=n;i++){
			for(z=i;z<=n;z++){
				System.out.print(" ");
			}
			
			for(j=1;j<=i*2-1;j++){
				if(j>=2 && j<=k && i!=n){
					System.out.print(" ");
				}
				else{System.out.print(j);}
			}
			if(i>=2 && i!=n){k+=2;}
			System.out.println();
		}
	}
}