module mul #(
  parameter BITS = 8
) (
  input [BITS-1:0] a,
  input b,
  output [31:0] c
)

assign c = b ? a : 32'b0;

endmodule
