package com.example.meajudaape.model

const val Padre_Teixeira = """
     {
    val imovel = Imovel(
        aluguel = "R$700,00",
        condominio = "R$300,00",
        iptu = "R$150,00",
        quartos = "2",
        suites = "0",
        banheiros = "2",
        area = "60m²",
        rua = "Padre Teixeira",
        numero = "1465",
        bairro = "Centro",
        cidade = "São Carlos",
        descricao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        caracteristicas = listOf(
            "Armário embutido",
            "Área de serviço",
            "Armário de cozinha",
            "Varanda"
        ),
        whatsapp = "(12) 91234-5678",
        codigoImovel = "12345"
    )
    """

const val Ap2 = """
     {
    val imovel = Imovel(
        aluguel = "R$1300,00",
        condominio = "R$400,00",
        iptu = "R$300,00",
        quartos = "3",
        suites = "1",
        banheiros = "2",
        area = "75m²",
        rua = "Marechal Deodoro",
        numero = "862",
        bairro = "Centro",
        cidade = "Poços de Caldas",
        descricao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        caracteristicas = listOf(
            "Armário embutido",
            "Área de serviço",
            "Armário de cozinha",
        ),
        whatsapp = "(12) 98765-4321",
        codigoImovel = "54321"
    )
    """

fun dados(): String = """
    {
    "Imovel" : [
    $Padre_Teixeira,
    $Ap2
    ]
    }
    """
