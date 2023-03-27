output "private_key" {
  value     = tls_private_key.private-key.private_key_pem
  sensitive = true
}

output "instance_public_ip" {
  description = "Public IP address of the EC2 instance"
  value       = aws_instance.app_server.public_ip
}