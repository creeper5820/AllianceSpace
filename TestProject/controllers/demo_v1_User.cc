#include "demo_v1_User.h"

using namespace demo::v1;

// Add definition of your processing function here
void User::login(const HttpRequestPtr& resquest,
    std::function<void(const HttpResponsePtr&)>&& callback,
    std::string&& userId,
    const std::string& password)
{
    LOG_DEBUG << "User " << userId << " login";
}

void User::getInfo(const HttpRequestPtr,
    std::function<void(const HttpResponsePtr&)>&& callback,
    std::string userId,
    const std::string& token) const
{
}