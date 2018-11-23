FROM appdynamics/machine:4.4 AS MA


ADD target/HAProxyMonitor-*.zip /opt/appdynamics/monitors

RUN unzip -q "/opt/appdynamics/monitors/HAProxyMonitor-*.zip" -d /opt/appdynamics/monitors
RUN find /opt/appdynamics/monitors/ -name '*.zip' -delete

CMD ["sh", "-c", "java ${MACHINE_AGENT_PROPERTIES} -jar /opt/appdynamics/machineagent.jar"]