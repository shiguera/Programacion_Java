public class Main {

    // Versión polimórfica: el código no necesita saber de qué tipo
    // concreto es cada evento. El bucle llama a procesar() sobre el tipo
    // declarado Evento y el enlace dinámico selecciona la implementación
    // correcta en cada caso.
    public static void procesarEventosPolimorficamente(Evento[] eventos) {
        for (Evento e : eventos) {
            System.out.println(e.procesar());
        }
    }

    // Versión alternativa con pattern matching en switch. Al ser Evento
    // una jerarquía sellada con exactamente tres subclases permitidas, el
    // switch es exhaustivo sin rama default: el compilador rechazaría el
    // código si faltara cubrir alguno de los tres tipos.
    public static void procesarEventosConSwitch(Evento[] eventos) {
        for (Evento e : eventos) {
            String resultado = switch (e) {
                case EventoAlarma a -> "(alarma) " + a.procesar();
                case EventoTrafico t -> "(tráfico) " + t.procesar();
                case EventoConfiguracion c -> "(configuración) " + c.procesar();
            };
            System.out.println(resultado);
        }
    }

    public static void main(String[] args) {
        Evento[] eventos = {
                new EventoAlarma("2026-03-01T10:15:00", "Sensor-07", 5),
                new EventoTrafico("2026-03-01T10:16:30", "Cámara-Norte", 82),
                new EventoConfiguracion("2026-03-01T10:20:00", "Router-Central", "ancho_banda", "500Mbps"),
                new EventoTrafico("2026-03-01T10:21:00", "Cámara-Sur", 25)
        };

        System.out.println("--- Procesamiento polimórfico ---");
        procesarEventosPolimorficamente(eventos);

        System.out.println("\n--- Procesamiento con switch ---");
        procesarEventosConSwitch(eventos);
    }
}
