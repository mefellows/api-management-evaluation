# API Management Test Project

This project contains a very simple CRUD API for use in evaluating a number of API Management Tools

## Setup

```scala
git clone
heroku addons:remove heroku-postgresql:dius-api-management
heroku addons:add mongohq
heroku config:set "DATABASE_URL=$(heroku config:get MONGOHQ_URL)"
```

## Testing APIs

Open the [Postman](https://www.getpostman.com/) json REST API [settings](postman.json) file and call the various CRUD operations.

Environment files have been setup to allow simple testing across the various API Management Tools.

### Local Setup

Run SBT and start the embedded Jetty container:

```
sbt
> container:start
```

### Remote

The app has been deployed to Heroku at `apiman.onegeek.com.au` and will be proxied by the various API Management Providers using the convention `<proxyname>.apiman.onegeek.com.au`.

* apigee.apiman.onegeek.com.au
* layer7.apiman.onegeek.com.au
* mashery.apiman.onegeek.com.au
* axway.apiman.onegeek.com.au
