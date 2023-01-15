/**
 * Write a description of class Test3 here.
 *
 * @author Christianne Gargoles
 * @version 11/21/2018
 */
import java.util.ArrayList;
import java.util.Random;
public class Test3 {
public static void main(String[] args) {
int[] diceRolls =new int[100];
setDiceRolls(diceRolls);
printDiceRolls(diceRolls);
sortDiceRolls(diceRolls);
System.out.println("\nSorted part: ");
printDiceRolls(diceRolls);
}
static void sortDiceRolls(int[] diceRolls) {
int[] a=countFaceOccurence(diceRolls);
int k,i;
for(i=0;i<a[0];i++){
diceRolls[i]=1;
}
for(;i<a[0]+a[1];i++){
diceRolls[i]=2;
}
for(;i<a[0]+a[1]+a[2];i++){
diceRolls[i]=3;
}
for(;i<a[0]+a[1]+a[2]+a[3];i++){
diceRolls[i]=4;
}
for(;i<a[0]+a[1]+a[2]+a[3]+a[4];i++){
diceRolls[i]=5;
}
for(;i<a[0]+a[1]+a[2]+a[3]+a[4]+a[5];i++){
diceRolls[i]=6;
}
}
static int[] countFaceOccurence(int[] diceRolls) {
int arr[]=new int[6];
for(int i=0;i<100;i++){
if(diceRolls[i]==1){
arr[0]++;
}
if(diceRolls[i]==2){
arr[1]++;
}
if(diceRolls[i]==3){
arr[2]++;
}
if(diceRolls[i]==4)
{arr[3]++;
}
if(diceRolls[i]==5){
arr[4]++;
}
if(diceRolls[i]==6){
arr[5]++;
}
}
return arr;
}
static void printDiceRolls(int[] diceRolls) {
int j=0;
for(int i=0;i<100;i++){
if(i%10==0 && i!=0){
System.out.println();
}
System.out.print(diceRolls[i]+" ");
}
}
static void setDiceRolls(int[] diceRolls) {
Random r=new Random();
for(int i=0;i<100;i++){
diceRolls[i]=r.nextInt(6)+1;
}
}
}

