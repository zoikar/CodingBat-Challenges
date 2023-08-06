/* Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0 */

public int diff21(int n) {
  int x=0;
  if(n>21){
    x = (n-21)*2;
  }else{
    x = n-21;
  }
  if(x<0){
    x=x*(-1);
  }
  
  return x;
}
