#include "employeestruct.h"
#include <iostream>

using namespace std;
int main() {
  // Create and populate an employee
  Employee anEmployee;
  anEmployee.firstInitial = 'M';
  anEmployee.lastInitial = 'G';
  anEmployee.employeeNumber = 42;
  anEmployee.salary = 80000;
  // Output the values of an employee
  cout << "Employee: " << anEmployee.firstInitial << anEmployee.lastInitial
       << endl;
  cout << "Number: " << anEmployee.employeeNumber << endl;
  cout << "Salay: $" << anEmployee.salary << endl;
  return 0;
};
