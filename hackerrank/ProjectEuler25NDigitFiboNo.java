//solving 3 test cases out of 4.. copied of someone afterwards.. in c++
//able to compute till 2000 bt not after that.. my code.. inn java... had to use clossed form...
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

class ProjectEuler25NDigitFiboNo {

    static BigDecimal a = new BigDecimal(1);
    static BigDecimal b = new BigDecimal(1);
    static BigDecimal c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        BigDecimal digit[] = new BigDecimal[5001];
        int t = Integer.parseInt(br.readLine());
        int k = 2, i = 2;
        digit[1] = a;
        while (k != 2000) {
            BigDecimal n = fibo();
            i++;
            int d=n.toString().length();
            if(d==k){
                digit[k]=new BigDecimal(i);
                k++;
            }
        }
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            pw.println(digit[n]);
        }
        pw.close();
    }

    static BigDecimal fibo() {        
        c = a.add(b);
        a=b;
        b=c;
        return c;
    }        
}



/*

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
 
 
int main() {
    int64_t n,tmp;
    vector<int> no;
    long double Phi=(1+sqrt(5))/2;
    long double phi=(sqrt(5)-1)/2;
    cin>>n;
    for(int i=0;i<n;i++)
        {
        cin>>tmp;
        no.push_back(tmp);
    }
 
    for(int j=0;j<n;j++)
        {
        if(no[j]>1){
            long double res= ceil(-1*(((no[j]-1)*log10(10))+(log10(5)/2.0))/(log10(phi)));
            cout<<res<<endl;
        }
        else if(no[j]==1)
            cout<<1<<endl;
        else
            cout<<0<<endl;
        }
 
    return 0;
}
*/
