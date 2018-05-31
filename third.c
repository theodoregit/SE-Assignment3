#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<sys/wait.h>
#include<fcntl.h>

int main(int argc,char*argv[]){
char *desc[12];
desc[0] = "createFile";
desc[1] = "create a file";
desc[2] = "copyFile";
desc[3] = "copy a file from the source to the destination";
desc[5] = "it can show us.......";
desc[4] = "display";
 if(argc == 1){
  for(int i = 0, i < 12, i+=2){
   printf("%s \t %s", desc[i], desc[i+1]);
  }
 }
 else if (argc > 1){
  for(int i = 0; i < 12; i += 2){
   if(argv[1] == desc[i]){
    printf("%s \t %s", desc[i], desc[i+1]); 
   }
  }
 }
}
