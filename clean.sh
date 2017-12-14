#!/usr/bin/env bash

for i in `find . -type d -name $1`
do
  echo $i
  rm -rf $i
done


