package com.lahiru.ims.feature.customer.router.firewallcredentials.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RouterFirewallCredentialsRequestDto {
    private String ip;
    private String port;
}
