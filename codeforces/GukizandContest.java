//package codeforces;
//
//import java.io.InputStream;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.StringTokenizer;
//
//public class GukizandContest {
//    public static void main(String args[])throws IOException{
//        
//        InputReader in=new InputReader(System.in);
//        PrintWriter pw=new PrintWriter(System.out);
//        ArrayList<Integer> arr=new ArrayList<Integer>();
//        int n=in.readInt();
//        int rank[]=new int[n];
//        int t;
//        for(int i=0;i<n;i++){
//            t=in.readInt();
//            arr.add(t);
//            rank[i]=1;
//         }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(arr.get(i) < arr.get(j))
//                    rank[i]++;
//            }
//        }
//        for(int i=0;i<n;i++)
//            pw.print(rank[i]+" ");
//        pw.close();
//    }
//}
//class InputReader
//    {
//        private InputStream stream;
//        private byte[] buf = new byte[102400];
//        private int curChar;
//        private int numChars;
//        private SpaceCharFilter filter;
// 
//        public InputReader(InputStream stream)
//        {
//            this.stream = stream;
//        }
// 
//        public int read()
//        {
//            if (numChars == -1)
//                throw new InputMismatchException();
//            if (curChar >= numChars)
//            {
//                curChar = 0;
//                try
//                {
//                    numChars = stream.read(buf);
//                } catch (IOException e)
//                {
//                    throw new InputMismatchException();
//                }
//                if (numChars <= 0)
//                    return -1;
//            }
//            return buf[curChar++];
//        }
// 
//        public int readInt()
//        {
//            int c = read();
//            while (isSpaceChar(c))
//                c = read();
//            int sgn = 1;
//            if (c == '-')
//            {
//                sgn = -1;
//                c = read();
//            }
//            int res = 0;
//            do
//            {
//                if (c < '0' || c > '9')
//                    throw new InputMismatchException();
//                res *= 10;
//                res += c - '0';
//                c = read();
//            } while (!isSpaceChar(c));
//            return res * sgn;
//        }
// 
//        public String readString()
//        {
//            int c = read();
//            while (isSpaceChar(c))
//                c = read();
//            StringBuilder res = new StringBuilder();
//            do
//            {
//                res.appendCodePoint(c);
//                c = read();
//            } while (!isSpaceChar(c));
//            return res.toString();
//        }
//        public double readDouble() {
//            int c = read();
//            while (isSpaceChar(c))
//                c = read();
//            int sgn = 1;
//            if (c == '-') {
//                sgn = -1;
//                c = read();
//            }
//            double res = 0;
//            while (!isSpaceChar(c) && c != '.') {
//                if (c == 'e' || c == 'E')
//                    return res * Math.pow(10, readInt());
//                if (c < '0' || c > '9')
//                    throw new InputMismatchException();
//                res *= 10;
//                res += c - '0';
//                c = read();
//            }
//            if (c == '.') {
//                c = read();
//                double m = 1;
//                while (!isSpaceChar(c)) {
//                    if (c == 'e' || c == 'E')
//                        return res * Math.pow(10, readInt());
//                    if (c < '0' || c > '9')
//                        throw new InputMismatchException();
//                    m /= 10;
//                    res += (c - '0') * m;
//                    c = read();
//                }
//            }
//            return res * sgn;
//        }
//        public long readLong() {
//            int c = read();
//            while (isSpaceChar(c))
//                c = read();
//            int sgn = 1;
//            if (c == '-') {
//                sgn = -1;
//                c = read();
//            }
//            long res = 0;
//            do {
//                if (c < '0' || c > '9')
//                    throw new InputMismatchException();
//                res *= 10;
//                res += c - '0';
//                c = read();
//            } while (!isSpaceChar(c));
//            return res * sgn;
//        }
//        public boolean isSpaceChar(int c)
//        {
//            if (filter != null)
//                return filter.isSpaceChar(c);
//            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//        }
// 
//        public String next()
//        {
//            return readString();
//        }
// 
//        public interface SpaceCharFilter
//        {
//            public boolean isSpaceChar(int ch);
//        }
//    }