// hello world: a single line comment
/*
hello there
a multiline comment
*/

// Preprocesser directives start with a '#'
// The most common use of header files is to declare functions that will be
// defined elsewhere
//
// A function declaration tells the compiler how a function is called, declaring
// the number and types of parameters, and the function return type.
//
// In C++, declarations usually go into files with the extension .h, known as
// header files, while definitions usually go into files with extension .cpp,
// known as source files.
// For more information on headers, look at the cpp notes on preprocessor
// directives
#include <iostream>

// the main function either takes no parameters, or takes two as follows:
// int main(int argc, char* argv[])
// argc: number of arguments passed to the program
// argv: contains the arguments
int main() {
  // I/O streams std::cout is the chute to the user console, or standard out.
  // Other chutes, std::cerr, outputs to the error console. The << operator
  // tosses date down the chute.
  std::cout << "hello, World!" << std::endl;
  return 0;
}
