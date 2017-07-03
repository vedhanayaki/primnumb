package guviset3;

public class primenumber {

	public static void main(String[] args) {
		int count=0,a=99;
		for(int i=10;i<=a;i++){
			count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
				if(count==2){
					System.out.println(i);
				}
			}
		}
	}

