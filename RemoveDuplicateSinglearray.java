import java.util.*;
// Remove the Duplicate from array Using Single loop.
public class RemoveDuplicateSinglearray{
	public static void main(String []args){
		int data[]={0,1, 3, 3, 3, 3, 3, 4, 3, 3, 3, 5, 6, 7, 8, 1, 1, 1, 1, 2, 2};
		//Array declearation
		int data1[]=new int[data.length];
		int j=1,k=1,i;
		//sort a array
		Arrays.sort(data);
		data1[0]=data[0];
		for(i=1;i<data.length;i++){
			if(data[i-1]!=data[i]){
				data1[j++]=data[i];
				k++;
			}
		}
		// remove the zeros and copy the parent array.
		int copy[]=Arrays.copyOf(data1,k);
		for(j=0;j<copy.length;j++){
			System.out.println(copy[j]);
		}
	}
}