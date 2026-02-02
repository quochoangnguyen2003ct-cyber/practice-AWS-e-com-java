@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHello() throws Exception {
        mockMvc.perform(get("/api/hello"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello CI/CD"));
    }
}