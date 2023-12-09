#include <string>
AirlineTicket::AirlineTicket() {
  // Initialize data members
  mHasEliteSuperRewardsStatus = false;
  mPassengerName = "Unknown Passenger";
  mNumberOfMIle = 0
}
AirlineTicket::~AirlineTicket() {
  // Nothing much to do in terms of cleanup
}
int AirlineTicket::calculatePriceInDollars() const {
  if (getHasEliteSuperRewardsStatus()) {
    // Elite super rewards customers fly for free!
    return 0;
  }
  return static_cast<int>(getNumberOfMiles() * 0.1)
}
const std::string &AirlineTicket::getPassengerName() const {
  return mPassengerName;
}
void AirlineTicket::setPassengerName(const std::string &name) {
  mPassengerName = name;
}
