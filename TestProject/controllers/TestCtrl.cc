#include "TestCtrl.h"

void TestCtrl::asyncHandleHttpRequest(const HttpRequestPtr& req, std::function<void(const HttpResponsePtr&)>&& callback)
{
    // write your application logic here

    auto response = HttpResponse::newHttpResponse();

    response->setStatusCode(k200OK);
    response->setContentTypeCode(CT_TEXT_HTML);
    response->setBody("Hello World!!");

    printf("Hello Controller!");

    callback(response);
}
