package com.dd.contest151.compare_strings_by_frequency_of_the_smallest_character;

class Solution {
    public static void main(String[] args) {
        String[] queries = {"bbb","cc"};
        String[] words = {"a","aa","aaa","aaaa"};
        int[] x = numSmallerByFrequency(queries,words);
        for (int s:
             x) {
            System.out.println(s);
        }
    }
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] answer = new int[queries.length];
        int[] wor = new int[words.length];
        for (int j = 0;j<words.length;j++){
            char[] wo = words[j].toCharArray();
            //int[] answer = {};
            int womin= 123;
            int womincount = 0;
            for (int i = 0;i<wo.length;i++){
                if((int)wo[i]<womin){
                    womin=wo[i];
                    womincount=1;
                }else if ((int)wo[i]==womin){
                    womincount++;
                }
            }
            //System.out.println(j);
            //System.out.println(womincount);
            wor[j]=womincount;
        }
        /*for (int i:
             wor) {
            System.out.println(i);
        }

         */

        int[] que= new int[queries.length];
        for (int i = 0;i<queries.length;i++){
            char[] qu = queries[i].toCharArray();

            int qumin = 123;
            int qumincount = 0;
           // int womin = 123;
           // int womincount = 0;
            for (int j = 0;j<qu.length;j++){
                if((int)qu[j]<qumin){
                    qumin=qu[j];
                    qumincount=1;
                }else if ((int)qu[j]==qumin){
                    qumincount++;
                }

            }
            que[i]=qumincount;
        }
        /*for (int i:
             que) {
            System.out.println(i);
        }

         */
        for (int i=0;i<queries.length;i++){
            answer[i]=0;
            for (int j=0;j<words.length;j++){
                if(que[i]<wor[j]){
                    answer[i]++;
                }
            }
            //System.out.println(answer[i]);
        }
        return answer;
    }
}