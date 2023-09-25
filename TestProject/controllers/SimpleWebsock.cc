#include "SimpleWebsock.h"

void SimpleWebsock::handleNewMessage(const WebSocketConnectionPtr& wsConnPtr, std::string&& message, const WebSocketMessageType& type)
{
    // write your application logic here
    wsConnPtr->send("Hello Websocket!");
}

void SimpleWebsock::handleNewConnection(const HttpRequestPtr& req, const WebSocketConnectionPtr& wsConnPtr)
{
    // write your application logic here
}

void SimpleWebsock::handleConnectionClosed(const WebSocketConnectionPtr& wsConnPtr)
{
    // write your application logic here
}
