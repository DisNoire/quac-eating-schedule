#The configuration for the `remote` backend.
terraform {
    backend "remote" {
         # The name of your Terraform Cloud organization.
         organization = "DisNoire"

         # The name of the Terraform Cloud workspace to store Terraform state files in.
         workspaces {
           name = "quac-eating-schedule"
         }
    }
}