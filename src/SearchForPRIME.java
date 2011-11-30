import java.util.Arrays;


public class SearchForPRIME {

	/**
	 * 求100以内的素数
	 * 将求得的素数放在一个数组中，用来判断之后的数字是否是素数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
		int[] prime= new int [100];
		prime[0]=1;
		prime[1]=2;
		prime[2]=3;
		prime[3]=5;
		int i=0;int j=0;int k=4;int m=1;
		loop:
		for(i=7;i<100;i++){
		
			for(m=1,j=prime[m];j<Math.sqrt(i)+1;j=prime[++m]){
				if(i%j==0)
					continue loop;
			}
			prime[k++]=i;
	}
		System.out.println(Arrays.toString(prime));
		long end = System.nanoTime();
		System.out.println(end-start);
}
}
