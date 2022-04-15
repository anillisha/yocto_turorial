#include <stdio.h>

int main()
{
  #ifdef USE_SYSCALL
    write(1,"HELLO System call",17);
  #else
    printf("Hello world\n");
  #endif
  return 0;
}
