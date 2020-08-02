#!/bin/bash

docker stop $(docker ps --all -q --filter ancestor="app-jar-2")

docker rm $(docker ps --all -q --filter ancestor="app-jar-2")
