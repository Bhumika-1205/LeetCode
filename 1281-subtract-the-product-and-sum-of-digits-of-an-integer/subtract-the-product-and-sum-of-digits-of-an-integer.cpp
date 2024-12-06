class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum=0,product=1,num=n;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            product*=digit;
            num/=10;
        }
        return(product-sum);
    }
};
