#comiple flags:
# -g adds debugging information to the executable file
#  -wall turns on most ,but not all ,compiler warnings
CFLAGS = -g -Wall -DUSE_SYSCALL


#the name to use for both the target source file and the output file:
TARGET = userprog

all: $(TARGET)

$(TARGET): $(TARGET).c
	${CC} $(CFLAGS) ${LDFLAGS} -o $(TARGET) $(TARGET).c

clean:
	rm -f $(TARGET)
