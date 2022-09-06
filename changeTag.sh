#!/bin/bash
sed "s/latestVersion/$1/g" pod-k8s-spring-boot-deployment.yml > k8s-spring-boot-deployment.yml
