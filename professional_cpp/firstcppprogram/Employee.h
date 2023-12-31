#pragma once // prevent file from being included multiple times
#include <string>
// Declare that the subsequent code will live in the Records namespace
namespace Records {
const int kDefaultStartingSalary = 30000;
class Employee {
public:
  Employee();
  void promote(int raiseAmount = 1000);
  void demote(int demeritAmount = 1000);
  void hire();          // Hires or rehires the employee
  void fire();          // Dismisses the employee
  void display() const; // outputs employee info to console

  // Getters and setters
  void setFirstName(const std::string &firstName);
  const std::string &getFirstName() const;

  void setLastName(const std::string &lastName);
  const std::string &getLastName() const;

  void setEmployeeNumber(int employeeNumber);
  int getEmployeeNumber() const;

  void setSalary(int newSalary);
  int getSalary() const;

  bool getIsHired() const;

private:
  std::string mFirstName;
  std::string mLastName;
  int mEmployeeNumber;
  int mSalary;
  bool mHired;
};
} // namespace Records
