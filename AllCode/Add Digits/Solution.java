public class Solution {
     public int addDigits(int num) {
         if(num<10){
			 return num;
		 }
		int temp=0;
		while(true){
			if(num>9){
				int b=num%10;
				num=num/10;
				temp+=b;
			}else{
				temp+=num;
				return addDigits(temp);
			}
		}
    }
}