// https://codingbat.com/java/AP-1

public class Solutions1 { 

  // AP-1 -> scoresIncreasing
  
  public boolean scoresIncreasing(int[] scores) {
    int max=scores[0]; boolean flag=false;
    for(int i=0; i<scores.length; i++){
      if(scores[i]>=max){
        max=scores[i];
        flag=true;
      }
      else { 
        return false;
      }
    }
    return flag;
  }
  
  // AP-1 -> scoresAverage
  
  public int scoresAverage(int[] scores) {
  int t=scores.length/2;
  int sum1=0; int avg1; int sum2=0; int avg2;
  for(int i=0; i<t; i++){
    sum1+=scores[i];
  }
  for(int i=t; i<scores.length; i++){
    sum2+=scores[i];
  }
  avg1 = sum1/(t);
  avg2 = sum2/(t);
  return Math.max(avg1, avg2);
}
  
  



}
