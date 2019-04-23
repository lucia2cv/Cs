#!/bin/bash
# -*- ENCODING: UTF-8 -*-

cd ./Proxy
docker-compose up -d

cd ../Web
docker-compose up -d
