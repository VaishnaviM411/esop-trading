data "aws_key_pair" "vaishnavi_key" {
  key_name           = "vaishnavi-gurukul"
  include_public_key = true
}

data "aws_vpc" "selected" {
  id = "vpc-019c09a1a0c5b4f6b"
}