module compare_unit (
  input z,
  input n,
  input v,
  input [1:0] alu_fn,
  output b_o
);

reg result;
assign b_o = result;

always @(*) begin
  case (alu_fn)
    'b01: result = z;
    'b10: result = n ^ v;
    'b11: result = z|(n^v);
  endcase
end

endmodule
