#!/bin/bash

docker stop $(docker ps --all -q --filter ancestor="app-jar")

docker rm $(docker ps -q --all --filter ancestor="app-jar")
