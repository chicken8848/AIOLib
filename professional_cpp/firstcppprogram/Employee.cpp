#include "Employee.h"
#include <iostream>
using namespace std;
namespace Records {
// Using another way to initialize a constructor
Employee::Employee()
    : mFirstName(""), mLastName(""), mEmployeeNumber(-1),
      mSalary(kDefaultStartingSalary), mHired(false) {}
void Employee::promote(int raiseAmount) {
  setSalary(getSalary() + raiseAmount);
}
void Employee::demote(int demeritAmount) {
  setSalary(getSalary() - demeritAmount);
}
void Employee::hire() { mHired = true; }
void Employee::fire() { mHired = false; }
void Employee::display() const {
  // Use getters and setters: it is good style
  cout << "Employee: " << getLastName() << ", " << getFirstName() << endl;
  cout << "-------------------------" << endl;
  cout << (mHired ? "Current Employee" : "Former Employee") << endl;
  cout << "Employee Number: " << getEmployeeNumber() << endl;
  cout << "Salary: $" << getSalary() << endl;
  cout << endl;
}
void Employee::setFirstName(const string &firstName) { mFirstName = firstName; }
const string &Employee::getFirstName() const { return mFirstName; }
void Employee::setLastName(const string &lastName) { mLastName = lastName; }
const string &Employee::getLastName() const { return mLastName; };
void Employee::setEmployeeNumber(int employeeNumber) {
  mEmployeeNumber = employeeNumber;
};
int Employee::getEmployeeNumber() const { return mEmployeeNumber; };
void Employee::setSalary(int newSalary) { mSalary = newSalary; };
int Employee::getSalary() const { return mSalary; };

bool Employee::getIsHired() const { return mHired; };

} // namespace Records
