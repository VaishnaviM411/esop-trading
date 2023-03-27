output "fingerprint" {
  value = data.aws_key_pair.vaishnavi_key.fingerprint
}

output "name" {
  value = data.aws_key_pair.vaishnavi_key.key_name
}

output "id" {
  value = data.aws_key_pair.vaishnavi_key.id
}