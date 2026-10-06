
cliente = input("Nombre del cliente: ")
producto = input("Nombre del producto: ")
precio = float(input("Precio: "))
cantidad = int(input("Porcentaje de IVA: "))
quiere_propina = input)("¿Incluir propina de 2€? (si/no): ")
quiere_propina_bool = quiere_propina == "si"

subtotal = precio * cantidad
total_con_iva = (iva / 100) * subtotal
total_final = total_con_iva + 2 * quiere_propina_bool
es_cliente_vip = total_final > 30
