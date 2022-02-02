//> using lib "org.scalameta::munit:0.7.29"

class ATesdt extends munit.FunSuite {
  test("hello") {
    val obtained = 42
    val expected = 43
    assertEquals(obtained, expected)
  }
}