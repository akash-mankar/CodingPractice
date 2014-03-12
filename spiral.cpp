void print_array_spiral(int mat[4][5])
{
   int j, i;
   int min_row, max_row;
   int min_col, max_col;
   
   min_row = 0;
   max_row = 3;
   min_col = 0;
   max_col = 4;

   while (min_col < max_col && min_row < max_row) {
      // Move rightwards and print
      for (i = min_col; i <= max_col; i++)
         printf("%2d ", mat[min_row][i]);
      min_row++;

      // Move downwards and print
      for (i = min_row; i <= max_row; i++)
         printf("%2d ", mat[i][max_col]);
      max_col--;
      
      // Move leftwards and print
      for (i = max_col; i >= min_col; i--)
         printf("%2d ", mat[max_row][i]);
      max_row--;

      // Move upwards and print
      for (i = max_row; i >= min_row; i--)
         printf("%2d ", mat[i][min_col]);
      min_col++;

      printf("\n");
   }
   
   printf("\n"); // one round is over, proceed to the next
}