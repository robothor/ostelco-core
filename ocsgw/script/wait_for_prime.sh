#!/bin/sh

set -e

echo "OCSGW waiting Prime to launch on 8082..."

while ! nc -z 172.16.238.4 8082; do
  sleep 0.1 # wait for 1/10 of the second before check again
done

echo "Prime launched"


./ocsgw-1.0.0-SNAPSHOT/bin/ocsgw