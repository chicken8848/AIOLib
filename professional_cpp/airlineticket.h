#include <string>
class AirlineTicket {
public:
  AirlineTicket();  // constructer: called when object is created
  ~AirlineTicket(); // deconstructor: called when dobject is destroyed
  int calculatePriceInDollars() const;
  const std::string &getPassengerName() const; // follow const correctness
  void setPassengerName(const std::string &name);
  int getNumberOfMiles() const;
  void setNumberOfMiles() const;
  bool getHasEliteSuperRewardsStatus() const;
  void setHasEliteSuperRewardsStatus(bool status);

private:
  std::string mPassengerName;
  int mNumberOfMiles;
  bool mHasEliteSuperRewardsStatus;
};
