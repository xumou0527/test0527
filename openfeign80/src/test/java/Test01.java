import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Test01 {

    @Test
    void Test() {

    }

    public static final String test="#\\n\\n version 7.1.070, Ess 6702\\n\\n#\\n\\nmdc Admin id 1\\n\\n#\\n\\n " +
            "sysname qfx-112.102\\n\\n#\\n\\nip vpn-instance vpn113\\n\\n#\\n\\n irf mac-address persistent " +
            "timer\\n\\n irf auto-update enable\\n\\n irf auto-merge enable\\n\\n undo irf link-delay\\n\\n irf " +
            "member 1 priority 1\\n\\n#\\n\\n vxlan tunnel mac-learning disable\\n\\n#\\n\\nospf 1\\n\\n " +
            "non-stop-routing\\n\\n area 0.0.0.0\\n\\n#\\n\\n lldp global enable\\n\\n#\\n\\n system-working-mode " +
            "standard\\n\\n xbar load-single\\n\\n password-recovery enable\\n\\n lpu-type f-series\\n\\n#\\n\\nvlan " +
            "1\\n\\n#\\n\\nvlan 2 to 4094\\n\\n#\\n\\nopenflow instance 1\\n\\n fail-open mode smart\\n\\n default " +
            "table-miss permit\\n\\n description SDN_INSTANCE_e610f220-0268-43cf-b5e7-c6f284eb8083\\n\\n flow-table " +
            "mac-ip 0 extensibility 1\\n\\n classification global\\n\\n controller 1 address ip 192.168.168.100 local" +
            " address ip 192.168.112.102 \\n\\n active instance\\n\\n#\\n\\n stp global " +
            "enable\\n\\n#\\n\\nftth\\n\\n#\\n\\n l2vpn enable\\n\\n l2vpn statistics interval 30\\n\\n vxlan tunnel " +
            "arp-learning disable\\n\\n#\\n\\n\\n\\n#\\n\\n\\n\\n ip address 168.168.168.102 255.255.255" +
            ".255\\n\\n#\\n\\ninterface LoopBack1\\n\\n#\\n\\ninterface Vlan-interface1\\n\\n dhcp client identifier " +
            "ascii b0f963309544-VLAN0001\\n\\n#\\n\\ninterface GigabitEthernet1/0/57\\n\\n port link-mode route\\n\\n" +
            " combo enable copper\\n\\n#\\n\\ninterface GigabitEthernet1/0/58\\n\\n port link-mode route\\n\\n combo " +
            "enable copper\\n\\n#\\n\\ninterface Ten-GigabitEthernet2/0/25\\n\\n port link-mode " +
            "bridge\\n\\n#\\n\\ninterface Ten-GigabitEthernet2/0/26\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface" +
            " Ten-GigabitEthernet2/0/27\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/28\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/29\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/30\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/31\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/32\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface M-GigabitEthernet0/0/0\\n\\n" +
            " ip address 192.168.112.102 255.255.0.0\\n\\n dhcp client identifier hex " +
            "02b0f963309544\\n\\n#\\n\\ninterface Tunnel257 mode vxlan\\n\\n#\\n\\ninterface Tunnel258 mode " +
            "vxlan\\n\\n#\\n\\ninterface Tunnel259 mode vxlan\\n\\n#\\n\\ninterface Tunnel260 mode " +
            "vxlan\\n\\n#\\n\\ninterface Tunnel261 mode vxlan\\n\\n#\\n\\ninterface Tunnel262 mode " +
            "vxlan\\n\\n#\\n\\ninterface Tunnel263 mode vxlan\\n\\n#\\n\\ninterface Tunnel264 mode " +
            "vxlan\\n\\n#\\n\\ninterface Tunnel265 mode vxlan\\n\\n#\\n\\ninterface Tunnel266 mode " +
            "vxlan\\n\\n#\\n\\ninterface Ten-GigabitEthernet2/0/3\\n\\n port link-mode route\\n\\n description " +
            "toleaf112.101\\n\\n\\n\\n ospf network-type p2p\\n\\n ospf 1 area 0.0.0.0\\n\\n lldp management-address " +
            "arp-learning\\n\\n\\n\\n#\\n\\ninterface Ten-GigabitEthernet2/0/5\\n\\n port link-mode route\\n\\n\\n\\n" +
            " ospf network-type p2p\\n\\n ospf 1 area 0.0.0.0\\n\\n lldp management-address " +
            "arp-learning\\n\\n\\n\\n#\\n\\ninterface Twenty-FiveGigE1/0/55\\n\\n port link-mode " +
            "route\\n\\n#\\n\\ninterface Twenty-FiveGigE1/0/56\\n\\n port link-mode route\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/1\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/2\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/4\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/6\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/7\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/8\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/9\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/10\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/11\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/12\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/13\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/14\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/15\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/16\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/17\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/18\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/19\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/20\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/21\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/22\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/23\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/24\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/33\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/34\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/35\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/36\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/37\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/38\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/39\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/40\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/41\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/42\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/43\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/44\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/45\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/46\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/47\\n\\n port link-mode bridge\\n\\n speed 1000 \\n\\n#\\n\\ninterface " +
            "Ten-GigabitEthernet2/0/48\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface FortyGigE2/0/49\\n\\n port " +
            "link-mode bridge\\n\\n#\\n\\ninterface FortyGigE2/0/50\\n\\n port link-mode bridge\\n\\n#\\n\\ninterface" +
            " FortyGigE2/0/51\\n\\n port link-mode bridge\\n\\n shutdown\\n\\n#\\n\\ninterface FortyGigE2/0/52\\n\\n " +
            "port link-mode bridge\\n\\n#\\n\\ninterface FortyGigE2/0/53\\n\\n port link-mode " +
            "bridge\\n\\n#\\n\\ninterface FortyGigE2/0/54\\n\\n port link-mode bridge\\n\\n#\\n\\n scheduler logfile " +
            "size 16\\n\\n#\\n\\nline class aux\\n\\n user-role network-admin\\n\\n#\\n\\nline class console\\n\\n " +
            "user-role network-admin\\n\\n#\\n\\nline class tty\\n\\n user-role network-operator\\n\\n#\\n\\nline " +
            "class vty\\n\\n user-role network-operator\\n\\n#\\n\\nline aux 0\\n\\n user-role " +
            "network-operator\\n\\n#\\n\\nline con 0\\n\\n user-role network-admin\\n\\n#\\n\\nline vty 0 63\\n\\n " +
            "authentication-mode scheme\\n\\n user-role network-admin\\n\\n user-role network-operator\\n\\n#\\n\\n " +
            "snmp-agent\\n\\n snmp-agent local-engineid 800063A280B0F96330954800000001\\n\\n snmp-agent community " +
            "write private\\n\\n snmp-agent community read public\\n\\n snmp-agent sys-info version all \\n\\n " +
            "snmp-agent target-host trap address udp-domain 192.168.175.75 params securityname snmpv3mgr v3 " +
            "privacy\\n\\n snmp-agent usm-user v3 snmpv3mgr user-role network-admin cipher authentication-mode md5 " +
            "$c$3$FkGiSZ0G+muMMxOLEA3fGQYjLoAEr2bnVmTRlfkS/NExEA== privacy-mode des56 " +
            "$c$3$5pVBen8ni6xYyJH2AjHEvocWYs0oZrtImnrgGZYBMTF/FA==\\n\\n#\\n\\n ssh server enable\\n\\n#\\n\\nradius " +
            "scheme system\\n\\n user-name-format without-domain\\n\\n#\\n\\ndomain system\\n\\n#\\n\\n domain " +
            "default enable system\\n\\n#\\n\\nrole name level-0\\n\\n description Predefined level-0 " +
            "role\\n\\n#\\n\\nrole name level-1\\n\\n description Predefined level-1 role\\n\\n#\\n\\nrole name " +
            "level-2\\n\\n description Predefined level-2 role\\n\\n#\\n\\nrole name level-3\\n\\n description " +
            "Predefined level-3 role\\n\\n#\\n\\nrole name level-4\\n\\n description Predefined level-4 " +
            "role\\n\\n#\\n\\nrole name level-5\\n\\n description Predefined level-5 role\\n\\n#\\n\\nrole name " +
            "level-6\\n\\n description Predefined level-6 role\\n\\n#\\n\\nrole name level-7\\n\\n description " +
            "Predefined level-7 role\\n\\n#\\n\\nrole name level-8\\n\\n description Predefined level-8 " +
            "role\\n\\n#\\n\\nrole name level-9\\n\\n description Predefined level-9 role\\n\\n#\\n\\nrole name " +
            "level-10\\n\\n description Predefined level-10 role\\n\\n#\\n\\nrole name level-11\\n\\n description " +
            "Predefined level-11 role\\n\\n#\\n\\nrole name level-12\\n\\n description Predefined level-12 " +
            "role\\n\\n#\\n\\nrole name level-13\\n\\n description Predefined level-13 role\\n\\n#\\n\\nrole name " +
            "level-14\\n\\n description Predefined level-14 role\\n\\n#\\n\\nuser-group system\\n\\n#\\n\\nlocal-user" +
            " admin class manage\\n\\n password hash " +
            "$h$6$UbzeUQ8NH26dzBEC$ax7hk0pgBaLuPCKCCIgHJR6AxMKc7jvk1dJBC+QIee3NEYYEi6ENe" +
            "+4cgLmN8ry344OGoxRIlzbKODsCddeXpQ==\\n\\n service-type telnet http https ssh\\n\\n " +
            "authorization-attribute user-role network-admin\\n\\n authorization-attribute user-role " +
            "network-operator\\n\\n#\\n\\n netconf soap http enable\\n\\n netconf soap https enable\\n\\n netconf ssh" +
            " server enable\\n\\n\\n#\\n\\ninterface NULL0\\n\\n\\n#\\n\\ninterface Ten-GigabitEthernet2/0/5\\n\\n " +
            "port link-mode route\\n\\n ip address unnumbered interface LoopBack0\\n\\n ospf network-type p2p\\n\\n " +
            "ospf 1 area 0.0.0.0\\n\\n lldp management-address arp-learning\\n\\n lldp tlv-enable basic-tlv " +
            "management-address-tlv interface LoopBack0\\n\\n#\\n\\ninterface Ten-GigabitEthernet2/0/3\\n\\n port " +
            "link-mode route\\n\\n description toleaf112.101\\n\\n ip address unnumbered interface LoopBack0\\n\\n " +
            "ospf network-type p2p\\n\\n ospf 1 area 0.0.0.0\\n\\n lldp management-address arp-learning\\n\\n lldp " +
            "tlv-enable basic-tlv management-address-tlv interface LoopBack0\\n\\n#\\n\\ninterface LoopBack0\\n\\n ip" +
            " address 168.168.168.102 255.255.255.255\\n\\n#";
}
