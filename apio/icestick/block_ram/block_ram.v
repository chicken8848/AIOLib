// Inferred block RAM
module memory (
  // inputs
  input clk,
  input w_en,
  input r_en,
  input [3:0] w_addr,
  input [3:0] r_addr,
  input [7:0] w_data,
  // outputs
  output reg [7:0] r_data
);

// Declare memory
reg [7:0] mem [0:15];

// Interact with the memory block
always @ (posedge clk) begin

  // Write to memory
  if (w_en == 1'b1) begin
    mem[w_addr] <= w_data;
  end
  // Read from memory
  if (r_en == 1'b1) begin
    r_data <= mem[r_addr];
  end
end
endmodule
