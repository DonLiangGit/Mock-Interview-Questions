#include <stdio.h>

int main() {
  int numarr[] = {2, 4, 1, 7, 10, 12, 15, 3, 14, 6, 11, 5, 13, 9, 34, 0, 16, 55};
  int i, j;

  // The numbers of elements of array
  int arrlth = sizeof(numarr)/sizeof(numarr[0]);

  // Start with first element of array and the element is not yet been paired (i != -1)
  for (i = 0; i < (arrlth - 1) && i != -1; i++){
      // Pair with the next element, next next and so on. The element was paired will be skipped (j == -1)
      for (j = i + 1; j < arrlth && j != -1; j++){
          if ((numarr[i] + numarr[j]) == 16){
            printf ("%d %d\n", numarr[i], numarr[j]);
            // -1 as a flag for numbers are paired
            numarr[i] = -1;
            numarr[j] = -1;
            // Once a pair found exit current for loop
            break;
          }
      }
  }
}
