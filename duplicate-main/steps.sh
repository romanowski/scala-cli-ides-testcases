#!/bin/bash

ROOT=$(cd "$(dirname "${BASH_SOURCE[0]}")" &> /dev/null && pwd)

cd $ROOT
$ROOT/../scala-cli.sh A.scala
